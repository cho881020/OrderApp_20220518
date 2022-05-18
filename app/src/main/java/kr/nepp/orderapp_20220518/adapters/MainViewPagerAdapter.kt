package kr.nepp.orderapp_20220518.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.nepp.orderapp_20220518.fragments.MyProfileFragment
import kr.nepp.orderapp_20220518.fragments.PizzaOrderFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount() = 2

    override fun getItem(position: Int): Fragment {
        return when(position) {

            0 -> PizzaOrderFragment()
            else -> MyProfileFragment()

        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "피자 주문"
            else -> "내 정보 설정"
        }
    }

}