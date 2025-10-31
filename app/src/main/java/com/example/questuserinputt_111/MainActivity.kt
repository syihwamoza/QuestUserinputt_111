package com.example.questuserinputt_111

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.questuserinputt_111.ui.theme.FormDataDiri
import com.example.questuserinputt_111.ui.theme.QuestUserinputt_111Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestUserinputt_111Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    FormDataDiri(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
