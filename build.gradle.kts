val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project

plugins {
    application
    kotlin("jvm") version "1.7.10"
    kotlin("kapt") version "1.7.10"
}

group = "com.example"
version = "0.0.1"
application {
    mainClass.set("com.example.infrastructure.config.ApplicationKt")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/ktor/eap") }
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-websockets-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-content-negotiation-jvm:$ktor_version")
    testImplementation("io.ktor:ktor-server-tests-jvm:$ktor_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")

    implementation("org.jetbrains.exposed:exposed-core:0.38.2")
    implementation("org.jetbrains.exposed:exposed-dao:0.38.2")
    implementation("org.jetbrains.exposed:exposed-jdbc:0.38.2")
    implementation("org.postgresql:postgresql:42.3.6")
    implementation("com.zaxxer:HikariCP:4.0.3")

    implementation("io.ktor:ktor-server-auth:$ktor_version")
    implementation("io.ktor:ktor-server-netty-jvm:$ktor_version")
    implementation("ch.qos.logback:logback-classic:1.2.11")

    //dagger2
    implementation("com.google.dagger:dagger:2.43.2")
    kapt("com.google.dagger:dagger-compiler:2.43.2")
    annotationProcessor("com.google.dagger:dagger-compiler:2.43.2")
}

tasks {
    create("stage").dependsOn("installDist")
}
