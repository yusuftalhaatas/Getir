package com.example.getir

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.getir.ui.theme.BackgroundColor
import com.example.getir.ui.theme.ButtonBackgroundColor
import com.example.getir.ui.theme.GetirTheme
import com.example.getir.ui.theme.MainColor
import com.example.getir.ui.theme.TextColor
import com.example.getir.ui.theme.TextColor2
import com.example.getir.ui.theme.mate

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GetirTheme {
                HomePage()
        }
    }
}

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun HomePage() {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = {
                CenterAlignedTopAppBar(
                    title = { Text(stringResource(R.string.app_name)) },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = MainColor,
                        titleContentColor = TextColor
                    )
                )
            }
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .background(color = BackgroundColor),
                verticalArrangement = Arrangement.Top,
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        stringResource(R.string.address_title),
                        modifier = Modifier.padding(16.dp),
                        color = MainColor,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        stringResource(R.string.address_details),
                        modifier = Modifier.padding(16.dp),
                        color = TextColor
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.map),
                    contentDescription = "Getir Map",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                )
                Column(
                    horizontalAlignment = Alignment.End,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                ) {
                    Text(
                        stringResource(R.string.happiness_title),
                        color = TextColor2,
                        fontSize = 25.sp,
                        fontFamily = mate,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(
                        stringResource(R.string.happiness_subtitle),
                        fontFamily = mate,
                        color = TextColor2
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        CustomButton(
                            imageRes = R.drawable.getir_market,
                            text = stringResource(R.string.getir_market),
                            modifier = Modifier.weight(1f)
                        )
                        CustomButton(
                            imageRes = R.drawable.getir_finans,
                            text = stringResource(R.string.getir_finans),
                            modifier = Modifier.weight(1f)
                        )
                    }
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        CustomButton(
                            imageRes = R.drawable.getir_carsi,
                            text = stringResource(R.string.getir_carsi),
                            modifier = Modifier.weight(1f)
                        )
                        CustomButton(
                            imageRes = R.drawable.getir_arac,
                            text = stringResource(R.string.getir_arac),
                            modifier = Modifier.weight(1f)
                        )
                    }

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        CustomButton(
                            imageRes = R.drawable.getir_alisveris,
                            text = stringResource(R.string.getir_alisveris),
                            modifier = Modifier.weight(1f)
                        )
                        CustomButton(
                            imageRes = R.drawable.getir_yemek,
                            text = stringResource(R.string.getir_yemek),
                            modifier = Modifier.weight(1f)
                        )

                    }
                }
            }
        }
    }

}



@Composable
fun CustomButton(imageRes: Int, text: String, modifier: Modifier = Modifier) {
    Button(
        onClick = {  },
        modifier = modifier
            .height(150.dp)
            .fillMaxWidth(),
        shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
        colors = androidx.compose.material3.ButtonDefaults.buttonColors(
            containerColor = ButtonBackgroundColor
        ),
        content = {
            Box(
                modifier = Modifier.fillMaxSize()
            ) {

                Text(
                    text = text,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = MainColor,
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(bottom = 20.dp)
                )
                Image(
                    painter = painterResource(id = imageRes),
                    contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .fillMaxSize()
                )
            }
        }
    )

}
