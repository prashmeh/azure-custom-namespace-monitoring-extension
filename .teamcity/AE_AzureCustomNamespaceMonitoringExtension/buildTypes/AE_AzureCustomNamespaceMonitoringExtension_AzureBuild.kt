package AE_AzureCustomNamespaceMonitoringExtension.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.dockerCommand
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.dockerCompose
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.maven

object AE_AzureCustomNamespaceMonitoringExtension_AzureBuild : BuildType({
    uuid = "de2e79f2-0341-497b-ab3a-c382670b111f"
    name = "Azure Build"

    vcs {
        root(AE_AzureCustomNamespaceMonitoringExtension.vcsRoots.AE_AzureCustomNamespaceMonitoringExtension_Azurecustomnamespacemonitoringextensionci)
    }

    steps {
        dockerCommand {
            commandType = build {
                source = file {
                    path = "Dockerfile"
                }
            }
        }
        dockerCompose {
            file = "docker-compose.yml"
        }
        maven {
            goals = "clean test"
            runnerArgs = "-Dmaven.test.failure.ignore=true"
            jdkHome = "%env.JDK_18%"
        }
    }
})
