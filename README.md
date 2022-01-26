# Overview

Figure out the use of activeprofile ONLY in the application.yml file vs. in code @ActiveProfile
Modify the controller to return a json obj that includes these values.

https://stackoverflow.com/a/61425251/140618
As a general rule, I avoid using Mockito with Kotlin tests (search StackOverflow for a couple of reasons why), or even mockito-kotlin. Best practice nowadays is to use the excellent MockK library in combination with either AssertJ or assertk for verifying your expectations.

## Plugin Management

See the article [Using Gradle Plugins # management](https://docs.gradle.org/current/userguide/plugins.html#sec:plugin_version_management)

As in the article Plugin Versions are defined in the `gradle.properties` file, then the setting is applied through `settings.gradle.kts` using `plugingManagement` so it applies to the entire build.

