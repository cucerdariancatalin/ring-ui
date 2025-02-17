package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.buildFeatures.commitStatusPublisher
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'GeminiTests'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("GeminiTests")) {
    features {
        remove {
            commitStatusPublisher {
                publisher = upsource {
                    serverUrl = "https://upsource.jetbrains.com"
                    projectId = "ring-ui"
                    userName = "TeamCityReporter"
                    password = "credentialsJSON:58d15732-d29f-42a6-a0e5-e88ab97c64dd"
                }
            }
        }
    }
}
