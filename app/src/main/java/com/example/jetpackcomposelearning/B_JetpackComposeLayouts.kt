package com.example.jetpackcomposelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposelearning.ui.theme.JetpackComposeLearningTheme
/**1. To create a new activity in jetpack compose :
right click on folder name where you want to create a new activity -> new->activity->gallery->empty activity - >name->okay.

 2. In the previous activity we saw that when two composables are defined in the same scope , the content gets overlapped with each other.
To solve that problem ,compose provides us the predefined layouts such as row, column,box.
3. Layout are the containers of UI elements
4. keep one and comment others to see its working style. **/
class B_JetpackComposeLayouts : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //1. Row Layout : the ui elements are arranged in horizonyal line.column arrange the elements in vertical fashion . It has many arrangement values
            // spaceBetween: divide the first and last element at the top and bottom of screen.
            //spaceEvenly: divide the space from top to bottom.
            //spaceSround: the space of first and last element from top and end of screen will be half of the inner elements
           //spaceBy : for custom spacing between the elements irrespective of screen size

            Row (modifier=Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.Top
            )
            {
                Text("hello")
                Text ("how")
                Text("are")
                Text("you")
        }


            //2. Column Layout: column arrange the elements in vertical fashion . It has many arrangement values
            //spaceBetween: divide the first and last element at the top and bottom of screen.
            //spaceEvenly: divide the space from top to bottom.
            //spaceSround: the space of first and last element from top and end of svcreen will be half of the inner elements
            //spaceBy : for custom spacing between the elements irrespective of screen size.
              /** Column(modifier=Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.Start)
            {
                Text("hello")
                Text ("how")
                Text("are")
                Text("you")
            } **/

            /** 3. box layout : It is used to contain multiple UI
         elements overlap each other . If you want to stop the
         overlapping position , you should use the compose modifiers
            which will be discussed later. giving a modifier is must
            to box  **/
        /**    Box(modifier= Modifier.fillMaxSize(), contentAlignment =Alignment.CenterStart) // giving modifier as to be shown on full screen size
            {
                //Text(text="hello")
                //Text(text="welcome")
                //now these above two lines will overlap each other , to overcome that , we will pass the alignment
                Text(text="hello" , modifier=Modifier.align( Alignment.Top))
                Text(text="welcome", modifier=Modifier.align( Alignment.End))
            } **/
        }
    }
}