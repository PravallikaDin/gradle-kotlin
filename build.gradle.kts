/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our samples at https://docs.gradle.org/7.5.1/samples
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {   
    id("java")
    id("java-library")
}
repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:31.0.1-jre")
    // https://mvnrepository.com/artifact/commons-io/commons-io
    implementation("commons-io:commons-io:2.11.0")
}

tasks.jar {
manifest {
    attributes["Main-Class"] = "com.ibm.cloud.codeengine.test.Main"
}
}