package com.plcoding.echojournal.echos.presentation.create_echo

import com.plcoding.echojournal.echos.presentation.echos.models.TrackSizeInfo
import com.plcoding.echojournal.echos.presentation.models.MoodUi

sealed interface CreateEchoAction {
    data object OnNavigationBackClick: CreateEchoAction
    data class OnTitleValueChange(val text: String): CreateEchoAction
    data class OnAddTopicChangeText(val text: String): CreateEchoAction
    data class OnNoteTextChange(val text: String): CreateEchoAction
    data object OnSelectMoodClick: CreateEchoAction
    data object OnDismissMoodSelector: CreateEchoAction
    data class OnMoodClick(val moodUi: MoodUi): CreateEchoAction
    data object OnConfirmMood: CreateEchoAction
    data class OnTopicClick(val topic: String): CreateEchoAction
    data object OnDismissTopicSuggestions: CreateEchoAction
    data object OnCancelClick: CreateEchoAction
    data object OnSaveClick: CreateEchoAction
    data object OnPlayAudioClick: CreateEchoAction
    data object OnPauseAudioClick: CreateEchoAction
    data class OnTrackSizeAvailable(val trackSizeInfo: TrackSizeInfo): CreateEchoAction
    data class OnRemoveTopicClick(val topic: String): CreateEchoAction
    data object OnGoBack: CreateEchoAction
    data object OnDismissConfirmDialog: CreateEchoAction
}