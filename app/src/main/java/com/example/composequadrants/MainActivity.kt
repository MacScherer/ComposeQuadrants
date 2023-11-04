package com.example.composequadrants

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrants.ui.theme.ComposeQuadrantsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantInfoCardApp()
                }
            }
        }
    }
}


@Composable
fun ComposableInfoCard(
    title: String,
    description: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify,
        )
    }
}

@Composable
fun QuadrantInfoCardApp() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = stringResource(R.string.quad_1_title),
                description = stringResource(R.string.quad_1_text),
                modifier = Modifier
                    .weight(1f)
                    .background(colorResource(R.color.quad_1))
                )
            ComposableInfoCard(
                title = stringResource(R.string.quad_2_title),
                description = stringResource(R.string.quad_2_text),
                modifier = Modifier
                    .weight(1f)
                    .background(colorResource(R.color.quad_2)),
            )
        }
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = stringResource(R.string.quad_3_title),
                description = stringResource(R.string.quad_3_text),
                modifier = Modifier
                    .weight(1f)
                    .background(colorResource(R.color.quad_3)),
            )
            ComposableInfoCard(
                title = stringResource(R.string.quad_4_title),
                description = stringResource(R.string.quad_4_text),
                modifier = Modifier
                    .weight(1f)
                    .background(colorResource(R.color.quad_4)),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantsTheme {
        QuadrantInfoCardApp()
    }
}