package com.plcoding.echojournal.echos.presentation.echos

import com.plcoding.echojournal.echos.domain.recording.RecordingDetails

sealed interface EchoEvent {
    data object RequestAudioPermission: EchoEvent
    data object RecordingTooShort: EchoEvent
    data class OnDoneRecording(val details: RecordingDetails): EchoEvent
}