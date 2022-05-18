package kr.nepp.orderapp_20220518.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kr.nepp.orderapp_20220518.R
import kr.nepp.orderapp_20220518.datas.StoreData

class PizzaStoreAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: List<StoreData>
) : ArrayAdapter<StoreData>(mContext, resId, mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if (tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.store_list_item, null)
        }

        val row = tempRow!!


        return row

    }

}