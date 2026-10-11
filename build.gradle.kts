plugins { id("com.android.application"); id("org.jetbrains.kotlin.android") }
android {
    namespace = "com.blackcam.app"
    compileSdk = 35
    defaultConfig { applicationId = "com.blackcam.app"; minSdk = 26; targetSdk = 35; versionCode = 1; versionName = "1.0" }
    compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
    kotlinOptions { jvmTarget = "17" }
}
dependencies {
    implementation("androidx.camera:camera-core:1.4.2")
    implementation("androidx.camera:camera-camera2:1.4.2")
    implementation("androidx.camera:camera-lifecycle:1.4.2")
    implementation("androidx.camera:camera-video:1.4.2")
    implementation("androidx.lifecycle:lifecycle-service:2.8.7")
    implementation("androidx.core:core:1.15.0")
}
