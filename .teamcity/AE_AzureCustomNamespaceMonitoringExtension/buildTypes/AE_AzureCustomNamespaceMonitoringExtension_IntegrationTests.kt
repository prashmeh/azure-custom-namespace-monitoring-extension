package AE_AzureCustomNamespaceMonitoringExtension.buildTypes

import AE_AzureCustomNamespaceMonitoringExtension.publishCommitStatus
import AE_AzureCustomNamespaceMonitoringExtension.vcsRoots.AE_AzureCustomNamespaceMonitoringExtension
import AE_AzureCustomNamespaceMonitoringExtension.withDefaults
import jetbrains.buildServer.configs.kotlin.v2018_2.BuildStep
import jetbrains.buildServer.configs.kotlin.v2018_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2018_2.FailureAction
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.exec
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2018_2.triggers.vcs

object AE_AzureCustomNamespaceMonitoringExtension_IntegrationTests : BuildType({
    uuid = "4530d5f8-7816-11ea-bc55-0242ac130003"
    name = "Run Integration Tests"

    withDefaults()

    steps {
        exec {
            path = "make"
            arguments = "dockerRun sleep"
        }
        maven {
            goals = "clean verify -DskipITs=false"
            mavenVersion = defaultProvidedVersion()
            jdkHome = "%env.JDK_18%"
        }
        exec {
            path = "make"
            arguments = "dockerStop"
        }
        exec {
            executionMode = BuildStep.ExecutionMode.ALWAYS // Learn:
            path = "make"
            arguments = "dockerClean"
        }
    }

    triggers {
        vcs {
        }
    }

    dependencies {
        dependency(AE_AzureCustomNamespaceMonitoringExtension_Build) {
            snapshot {
                onDependencyFailure = FailureAction.FAIL_TO_START
            }
            artifacts {
                artifactRules = """
                +:target/AzureCustomNamespaceMonitor-*.zip => target/
            """.trimIndent()
            }
        }
    }

    publishCommitStatus()
})