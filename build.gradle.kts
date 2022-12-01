plugins {   
    id("application")
}
repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:31.0.1-jre")
    // https://mvnrepository.com/artifact/commons-io/commons-io
    implementation("commons-io:commons-io:2.11.0")
}

application {
    mainClass.set("com.ibm.cloud.codeengine.test.Main")
}