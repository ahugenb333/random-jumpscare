package com.ahugenb.rjs

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.torrydo.floatingbubbleview.service.expandable.BubbleBuilder
import com.torrydo.floatingbubbleview.service.expandable.ExpandableBubbleService
import com.torrydo.floatingbubbleview.service.expandable.ExpandedBubbleBuilder

class ImageBubbleService: ExpandableBubbleService() {

    override fun onCreate() {
        super.onCreate()
        minimize()
    }

    // optional, only required if you want to call minimize()
    override fun configBubble(): BubbleBuilder? {
        return BubbleBuilder(this)
            .startLocation(45, 40)
            .bubbleCompose {
                GifBubbleView(modifier = Modifier.fillMaxSize())
            }
    }

    override fun configExpandedBubble(): ExpandedBubbleBuilder? {
        return ExpandedBubbleBuilder(this)
            .startLocation(45, 40)
            .expandedCompose {
                GifBubbleView(modifier = Modifier.fillMaxSize())
            }
    }
}