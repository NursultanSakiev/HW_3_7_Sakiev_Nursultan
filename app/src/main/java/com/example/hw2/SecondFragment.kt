package com.example.hw2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hw2.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private val data = arrayListOf<Lesson>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            FragmentSecondBinding.inflate(LayoutInflater.from(requireContext()), container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        binding.recyclerView
        val adapter = LessonAdapter(data = data)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
    }

    private fun loadData() {
        data.add(
            Lesson(
                R.color.purple_200,
                "физика",
                "https://scse.d.umn.edu/sites/scse.d.umn.edu/files/umd_dept_home/physics-chalkboard_cropped.jpg"
            )
        )
        data.add(
            Lesson(
                R.color.purple_500,
                "математика",
                "https://img.freepik.com/free-vector/chalkboard-with-math-elements_1411-88.jpg"
            )
        )
        data.add(
            Lesson(
                R.color.black,
                "химия",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2e/Gnome-applications-science.svg/1200px-Gnome-applications-science.svg.png"
            )
        )
        data.add(
            Lesson(
                R.color.white,
                "литература",
                "https://static.mk.ru/upload/entities/2019/04/11/23/articles/detailPicture/ec/ac/6d/01/306db442fae94a1476ddba3306b1f42f.jpg"
            )
        )
        data.add(
            Lesson(
                R.color.purple_500,
                "Физскультура",
                "https://thumbs.dreamstime.com/b/%D1%84%D0%B8%D0%B7%D0%BA%D1%83%D0%BB%D1%8C%D1%82%D1%83%D1%80%D0%B0-122851088.jpg"
            )
        )
        data.add(
            Lesson(
                R.color.teal_700,
                "Биология",
                "https://www.profguide.io/images/article/a/4/NbHbjQExhg.jpg"
            )
        )
        data.add(
            Lesson(
                R.color.white,
                "Экономика",
                "https://cdn-user84060.skyeng.ru/uploads/60b882b575aa7772804605.png"
            )
        )
        data.add(
            Lesson(
                R.color.teal_700,
                "География",
                "https://natworld.info/wp-content/uploads/2020/05/polza-nauki-geografiya-dlya-cheloveka.jpg"
            )
        )

    }
}