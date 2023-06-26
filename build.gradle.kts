plugins {
    id("java")
}

group = "org.mrmtech"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("io.rest-assured:rest-assured:5.3.1")
    testImplementation("io.github.json-snapshot:json-snapshot:1.0.17")
    testImplementation("com.fasterxml.jackson.core:jackson-databind:2.15.2")
    testImplementation("com.fasterxml.jackson.core:jackson-annotations:2.15.2")
    compileOnly("org.projectlombok:lombok:1.18.28")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        setEvents(setOf("passed", "skipped", "failed", "standardOut", "standardError"))
        setExceptionFormat("full")
        showStandardStreams = true
        showStandardStreams = true
        showCauses = true
        showExceptions = true
    }


}