package org.capstone.yourmate.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.capstone.yourmate.R
import org.capstone.yourmate.databinding.LayoutItemFriendRecommendationBinding
import org.capstone.yourmate.diff_utils.UserDiffUtil
import org.capstone.yourmate.domain.model.User

class FriendRecommendationAdapter :
    ListAdapter<User, FriendRecommendationAdapter.FriendRecommendationViewHolder>(UserDiffUtil()) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FriendRecommendationViewHolder {
        val binding = LayoutItemFriendRecommendationBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return FriendRecommendationViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FriendRecommendationViewHolder, position: Int) {
        getItem(position)?.let {
            holder.bind(it)
        }
    }

    class FriendRecommendationViewHolder(private val binding: LayoutItemFriendRecommendationBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(user: User) {
            with(binding) {
                Glide.with(itemView.context)
                    .load(user.profileImage)
                    .error(R.drawable.ic_image)
                    .into(ivProfilePicture)

                tvName.text = user.name
            }
        }
    }

}