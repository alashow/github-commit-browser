package org.codepond.commitbrowser.common.ui

import androidx.lifecycle.ViewModel

import org.codepond.commitbrowser.api.GithubApi

abstract class BaseViewModel(protected val githubApi: GithubApi) : ViewModel()
