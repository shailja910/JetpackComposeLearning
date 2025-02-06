package com.example.jetpackcomposelearning

import android.icu.text.Transliterator.Position
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Button
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp

/** Previously with xml UI, the koltin class had the
 * setContentView(r.activity.xmlfilename) , which links
 * the xml file to the koltin file . But in jetpack compose
 * we have (at line 21) the setContent {}.( setContent is a fxn expressed
 * in curly bracket as it accepts the another functions as
 * the parameters) .
 *
 * In jetpack compose every parameter passed inside the setcontent{}
 * fxn should be a call to predefined compose function also called
 * composables and all the composable calls are separated by semi colon.
Android provides some set of default compose functions such as
Text , Icon , Font etc **/
class A_Jetpack_Basics : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           /** /** 1. Text is a predefined composable
            1.1. Predefined Composable Text{} : this composable has many
            other parameters to pass , if you do not pass anything ,
            they get the dfault values eg: Text("text", color , font ,
            size )
            2. option+command+B to see implementation of predefined classes

            2.1. if you wanted to use a predefined composable and
                    have no idea about which paramaters are mandatory
                    to define , take the cursor to the name of composable
            and in the composable description , at the top , it will
            show you something written as "No value passed for parameter 'onClick' "
            where onClick will be the name of the must defined parameter.
           **/
            Text(text="hello") ; Text("delhi"); // two text composable called separated by semi colon
            Text(text="delhi" , color=Color.Red , fontSize=22.sp )
            // 4. call to "user defined composable",All the user
            // defined composables must be called from the setContent {} and defined outside the class body
            OwnFxn("shelly")

            /** 3.  "Button" is also a predefined composable , where the first
            // parameter is " what to do on click" is also a unit fxn that is
            why defined in curly bracket.and content (what is the name of the button)
            is also  another fxn, so defined in curly brackets. **/
            Button(  onClick = {println("cliicked")},
                     content={ Text(text="button")}
                  )

            /** 4. predefined composable "Icon" used to give icon **/
            Icon(painter = painterResource(R.drawable.ic_launcher_background), contentDescription = "hello")

            /** 5. predefined composable "Image" **/
            Image(painter = painterResource(R.drawable.ic_launcher_background), contentDescription = "herofgkportgportjg")

            /** 6. "TextField" composable for text view **/

            /** 7. FloatingActionButton  : here onclick and content
             * act as the patameters to the predefined composable fxn.
             * FAB({onClick{println(Hello")} , content =null )
             * But if you want to add the user related info like icon
             * and all , then make a curly bracket body
             * of FAB(on click{}) {icon{}} {here define the icon like content} )
              **/
            FloatingActionButton(onClick = {println("hello")})
            { Icon(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "hello"
                ) }

            /** 8. ExtendedFloatingActionButton **/
            ExtendedFloatingActionButton(onClick = {println("hello")})
            {
                Icon(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "hello"
                )
            }

**/
            /**2 composables in one scope  : comment anove code and put only two composables**/
            Text("hello ")
            Button(onClick = {println("hello")} ,
                content = { Text("hell") }
            )
        }
    }
}

    //outside the class
    @Composable
    fun OwnFxn(name:String)
    {
        Text(text= "Hello $name ")
    }
