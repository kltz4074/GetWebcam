plugins {
    id("java")
    id("application") // Add this
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.github.sarxos:webcam-capture:0.3.12")
}
application {
    mainClass = "org.GetWebcam.Main"
}
tasks.test {
    useJUnitPlatform()
}