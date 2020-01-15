package nagoya.kuu.miolife.ui.main

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import nagoya.kuu.miolife.databinding.ContractItemBinding
import nagoya.kuu.miolife.ui.main.viewentity.ContractViewEntity

internal class ContractViewHolder private constructor(
    private val binding: ContractItemBinding
) : RecyclerView.ViewHolder(binding.root) {

    companion object {
        fun create(
            context: Context,
            container: ViewGroup
        ): ContractViewHolder {
            return ContractViewHolder(
                ContractItemBinding.inflate(
                    LayoutInflater.from(context),
                    container,
                    false
                )
            )
        }
    }

    fun bindTo(
        contractViewEntity: ContractViewEntity,
        context: Context
    ) {
        binding.viewentity = contractViewEntity
        val simAdapter = SimListAdapter(context)
        simAdapter.submitList(contractViewEntity.simList)
        binding.simRecyclerView.adapter = simAdapter

    }
}