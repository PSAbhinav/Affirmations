package com.example.affirmations.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.affirmations.data.Datasource


@Composable
fun AffirmationList() {

    val affirmationList = Datasource().loadAffirmations()

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(affirmationList) { affirmation ->
            AffirmationCard(affirmation = affirmation)
        }
    }
}