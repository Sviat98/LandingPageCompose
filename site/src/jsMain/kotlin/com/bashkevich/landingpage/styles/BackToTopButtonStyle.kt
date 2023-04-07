package com.bashkevich.landingpage.styles

import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.rotate
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.ms

val BackToTopButtonStyle by ComponentStyle {
    base {
        Modifier
            .rotate(180.deg)
            .transition(CSSTransition(property = "rotate", duration = 200.ms))
    }
    hover{
        Modifier
            .rotate(0.deg)
    }
}