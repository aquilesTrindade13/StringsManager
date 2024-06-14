
plugins {
    id("com.android.application")
    
}

android {
    namespace = "com.trindade.stringscreator"
    compileSdk = 34
    
    defaultConfig {
        applicationId = "com.trindade.stringscreator"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        
        vectorDrawables { 
            useSupportLibrary = true
        }
    }
    
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_22
        targetCompatibility = JavaVersion.VERSION_22
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        viewBinding = true
        buildConfig = true
    }
    
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0-alpha-03")
    implementation("androidx.constraintlayout:constraintlayout:2.2.0-alpha11")
    implementation("com.google.android.material:material:1.11.0")
    implementation("com.google.code.gson:gson:2.11.0")
    implementation("com.squareup.retrofit2:retrofit:2.11.0")
    implementation("com.squareup.retrofit2:converter-gson:2.11.0")
    implementation("com.github.bumptech.glide:glide:4.16.0")
}
