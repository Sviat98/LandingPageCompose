package com.bashkevich.landingpage.models

enum class Section(
    val id: String,
    val title: String,
    val subTitle: String,
    val path: String
) {
    Home(
        id = "home",
        title = "Home",
        subTitle = "",
        path = "#home"
    ),
    About(
        id = "about",
        title = "About me",
        subTitle = "Why Hire me?",
        path = "#about"
    ),
    Service(
        id = "service",
        title = "Service",
        subTitle = "I'm Good at",
        path = "#service"
    ),
    Portfolio(
        id = "portfolio",
        title = "Portfolio",
        subTitle = "My Work",
        path = "#portfolio"
    ),
    Experience(
        id = "experience",
        title = "Experience",
        subTitle = "Work Experience",
        path = "#experience"
    ),
    Contact(
        id = "contact",
        title = "Contact me",
        subTitle = "Get in Touch",
        path = "#contact"
    ),
    Testimonial(
        id = "testimonial",
        title = "Testimonial",
        subTitle = "Happy Customers",
        path = "#testimonial"
    ),
    Achievements(
        id = "achievements",
        title = "Achievements",
        subTitle = "Personal Achievements",
        path = "#achievements"
    ),

}