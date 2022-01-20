pluginManagement {
    val springBootVersion: String by settings
    val springDependencyManagementVersion: String by settings
    val kotlinJvmVersion: String by settings
    val kotlinSpringVersion: String by settings
    plugins {
        id("org.springframework.boot") version springBootVersion
        id("io.spring.dependency-management") version springDependencyManagementVersion
        kotlin("jvm") version kotlinJvmVersion
        kotlin("plugin.spring") version kotlinSpringVersion
    }
}

rootProject.name = "ReferenceApp"
