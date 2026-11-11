
package com.omkar.music

import android.content.Context
import android.media.MediaPlayer
import android.net.Uri

class MusicPlayer(context: Context) {

    private var mediaPlayer: MediaPlayer? = null
    private val appContext = context.applicationContext

    fun play(song: Song) {
        stop()

        try {
            mediaPlayer = MediaPlayer().apply {
                setDataSource(appContext, Uri.parse(song.uri))
                setOnPreparedListener { it.start() }
                prepareAsync()
            }
        } catch (e: Exception) {
            e.printStackTrace()
            stop()
        }
    }

    fun pause() {
        mediaPlayer?.let {
            if (it.isPlaying) it.pause()
        }
    }

    fun resume() {
        mediaPlayer?.let {
            if (!it.isPlaying) it.start()
        }
    }

    fun stop() {
        mediaPlayer?.let {
            try {
                it.stop()
                it.release()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        mediaPlayer = null
    }

    fun release() {
        stop()
    }
}

