package com.iacovelli.moviesapp.common.ui

import com.iacovelli.moviesapp.common.OpenTvShowContract
import com.iacovelli.moviesapp.models.TvShow

class ItemTvShowPresenter(
        private var contract: OpenTvShowContract? = null,
        private val tvShow: TvShow) {

    val name: String
        get() = tvShow.name

    val overview: String
        get() = tvShow.overview ?: ""

    val rating: Float
        get() = tvShow.voteAverage

    val backdropUrl: String?
        get() = tvShow.backdropPath

    val posterUrl: String?
        get() = tvShow.posterPath

    fun onClick() {
        contract?.openTvShow(tvShow.id)
    }

    fun onDestroy() {
        contract = null
    }
}