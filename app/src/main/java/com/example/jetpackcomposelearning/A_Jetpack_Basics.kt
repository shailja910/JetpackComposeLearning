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

/** Jetpack compose is used to make the UI part of the android application in the kotlin language in the .kt files.  The xml for designing layout is violated.Now kotlin as UI code as well as business logic.
1. Now the Ui will be implemented in the .kt file using compose fxns. Any fxn can be made compose fxn by adding annotation “@composable” to it. The compose fxn name are written in pascal style and they always have unit as return type
2. Whenever you make a new android project choose the “empty compose activity” and it will automatically create the Ui of app in the MainActivity.kt file. That means android is not having the layout folder anymore.
3. Previously with xml UI, the kotlin class had the
  setContentView(r.activity.xmlfilename) , which links
 the xml file to the koltin file . But in jetpack compose
  we have (at line 37) the setContent {}.( setContent is a fxn expressed
  in curly bracket as it accepts the another functions as
  the parameters) .

 4. In jetpack compose every parameter passed inside the setcontent{}
 * fxn should be a call to predefined compose function also called
 * composables and all the composable calls are separated by semi colon.
Android provides some set of default compose functions such as
Text , Icon , Font etc **/
class A_Jetpack_Basics : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /**
             * 1.option+command+B to see implementation of predefined classes

            1.1. if you wanted to use a predefined composable and
                    have no idea about which paramaters are mandatory to give parameter value to,
            to define , take the cursor to the name of composable
            and in the composable description , at the top , it will
            show you something written as "No value passed for parameter 'onClick' "
            where onClick will be the name of the must defined parameter.

            2. Below is the list of predefined composables available in jetpack compose library . **/

            //2.1. Text{} : this composable has many other parameters to pass , if you do not pass anything ,
           // they get the default values eg: Text(__, color , font ,
           // size ) , but passing the text value parameter is must.

            Text(text="hello") ; Text("delhi"); // two text composable called separated by semi colon
            Text(text="delhi" , color=Color.Red , fontSize=22.sp )

           // 2.1 composables in one scope  : the above two composable will overlap the content of device UI of each other , so run only one and comment other one by one.

           //  3.  "Button" :where the first parameter is " what to do on click" is also a unit fxn that is
           // why defined in curly bracket.and content (what is the name of the button)
            //is also  another fxn, so defined in curly brackets. **/

            Button(  onClick = {println("cliicked")},
            content={ Text(text="button")}
            )

             // 4. "Icon" : used to give icon **/
            Icon(painter = painterResource(R.drawable.ic_launcher_background), contentDescription = "hello")

            // 5. predefined composable "Image" **/
            Image(painter = painterResource(R.drawable.ic_launcher_background), contentDescription = "herofgkportgportjg")

            // 6. "TextField" composable for text view learn later**/

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

            // 8. ExtendedFloatingActionButton **/
            ExtendedFloatingActionButton(onClick = {println("hello")})
            {
            Icon(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "hello"
            ) }

            // 9. call to "user defined composable",All the user
            // defined composables must be called from the setContent {} and defined outside the class body
            OwnFxn("shelly")

        }
    }
}

    //user defined composable outside the class
    @Composable
    fun OwnFxn(name:String)
    {
        Text(text= "Hello $name ")
    }
