package com.huda.submission_3_made


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_movies.*

/**
 * A simple [Fragment] subclass.
 */
class TvShowFragment : Fragment() {

    private lateinit var adapter: ListMoviesAdapter
    private lateinit var mainViewModel: MainViewModelMovies

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tv_show, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        adapter = ListMoviesAdapter()
//        adapter.notifyDataSetChanged()
//
//        rv_movies.layoutManager = LinearLayoutManager(activity)
//        rv_movies.adapter = adapter
//
//        mainViewModel = ViewModelProvider(
//            this,
//            ViewModelProvider.NewInstanceFactory()
//        ).get(MainViewModelMovies::class.java)
//        mainViewModel.setFilm()
//        showLoading(true)
//        mainViewModel.getFilm().observe(this, Observer { filmItems ->
//            if (filmItems != null) {
//                adapter.setData(filmItems)
//                showLoading(false)
//            }
//        })
    }

    private fun showLoading(state: Boolean) {
        if (state) {
            progressBar.visibility = View.VISIBLE
        } else {
            progressBar.visibility = View.GONE
        }
    }

}
