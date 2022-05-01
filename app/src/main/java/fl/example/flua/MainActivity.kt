package fl.example.flua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.myapplication.Fragment1
import com.example.myapplication.Fragment2
import com.example.myapplication.Fragment3
import com.example.myapplication.Fragment4
import fl.example.flua.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.setOnItemSelectedListener {
            val fragment: Fragment
            when (it.itemId) {
                R.id.item_1 -> {
                    fragment = Fragment1.newInstance()
                    setCurrentFragment(fragment)
                }
                R.id.item_2 -> {
                    fragment = Fragment2.newInstance()
                    setCurrentFragment(fragment)
                }
                R.id.item_3 -> {
                    fragment = Fragment3.newInstance()
                    setCurrentFragment(fragment)
                }
                R.id.item_4 -> {
                    fragment = Fragment4.newInstance()
                    setCurrentFragment(fragment)
                }
            }
            true
        }
        binding.bottomNavigationView.selectedItemId = R.id.item_1
    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.commit {
            replace(R.id.fragmentContainerView, fragment)
        }
    }
}