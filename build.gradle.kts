plugins {
    java
    id("io.qameta.allure") version "2.12.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    // JUnit
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // Allure
    testImplementation("io.qameta.allure:allure-junit5:2.29.1")

    // Flyway
    testImplementation("org.flywaydb:flyway-core:10.22.0")
    testImplementation("org.flywaydb:flyway-mysql:10.22.0")

    // MySQL
    testImplementation("com.mysql:mysql-connector-j:9.4.0")
}

allure {
    version.set("2.29.1")
}

tasks.test {
    useJUnitPlatform()

    testLogging {
        events("passed", "failed", "skipped")
    }
}