package com.example.smartandroidappcomposeui.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.sp
import com.example.smartandroidappcomposeui.R

val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)


val nunitoSansFont = FontFamily(
    Font(googleFont = GoogleFont("Nunito Sans"), fontProvider = provider)
)

val salsaFont = FontFamily(
    Font(googleFont = GoogleFont("Salsa"), fontProvider = provider)
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = nunitoSansFont,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    displayMedium = TextStyle(
        fontFamily = salsaFont,
        fontWeight = FontWeight.W400,
        fontSize = 45.sp,
        lineHeight = 52.sp
    ),
    displaySmall = TextStyle(
        fontFamily = salsaFont,
        fontWeight = FontWeight.W400,
        fontSize = 36.sp,
        lineHeight = 44.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = salsaFont,
        fontWeight = FontWeight.W600,
        fontSize = 32.sp,
        lineHeight = 40.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = salsaFont,
        fontWeight = FontWeight.W400,
        fontSize = 28.sp,
        lineHeight = 36.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = salsaFont,
        fontWeight = FontWeight.W400,
        fontSize = 24.sp,
        lineHeight = 32.sp
    ),
    titleLarge = TextStyle(
        fontFamily = nunitoSansFont,
        fontWeight = FontWeight.W500,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.5.sp
    ),
    titleMedium = TextStyle(
        fontFamily = nunitoSansFont,
        fontWeight = FontWeight.W500,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    titleSmall = TextStyle(
        fontFamily = nunitoSansFont,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp
    ),
//    bodyLarge = TextStyle(
//        fontFamily = nunitoSansFont,
//        fontWeight = FontWeight.W400,
//        fontSize = 16.sp,
//        lineHeight = 24.sp,
//        letterSpacing = 0.5.sp
//    ),
    bodyMedium = TextStyle(
        fontFamily = nunitoSansFont,
        fontWeight = FontWeight.W400,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp
    ),
    bodySmall = TextStyle(
        fontFamily = nunitoSansFont,
        fontWeight = FontWeight.W400,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
    labelLarge = TextStyle(
        fontFamily = nunitoSansFont,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp
    ),
    labelMedium = TextStyle(
        fontFamily = nunitoSansFont,
        fontWeight = FontWeight.W500,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
    labelSmall = TextStyle(
        fontFamily = nunitoSansFont,
        fontWeight = FontWeight.W500,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)
