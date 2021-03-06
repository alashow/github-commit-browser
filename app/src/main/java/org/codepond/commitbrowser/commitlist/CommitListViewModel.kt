/*
 * Copyright 2019 Nimrod Dayan nimroddayan.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codepond.commitbrowser.commitlist

import androidx.lifecycle.SavedStateHandle
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject
import org.codepond.commitbrowser.api.GithubApi
import org.codepond.commitbrowser.common.ui.BaseViewModel
import org.codepond.commitbrowser.di.ViewModelAssistedFactory
import timber.log.Timber

class CommitListViewModel @AssistedInject constructor(
    @Assisted handle: SavedStateHandle,
    githubApi: GithubApi
) : BaseViewModel(handle, githubApi) {

    fun loadCommits() {
        Timber.v("Request commit list")
    }

    @AssistedInject.Factory
    interface Factory : ViewModelAssistedFactory<CommitListViewModel>
}
