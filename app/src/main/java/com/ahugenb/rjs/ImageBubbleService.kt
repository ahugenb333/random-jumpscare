package com.ahugenb.rjs

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
            .bubbleCompose {
                GifBubbleView()
            }
    }

    override fun configExpandedBubble(): ExpandedBubbleBuilder? {
        return ExpandedBubbleBuilder(this)
            .expandedCompose {
                GifBubbleView()
            }
    }
}