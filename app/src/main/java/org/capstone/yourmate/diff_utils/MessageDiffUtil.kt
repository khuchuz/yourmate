package org.capstone.yourmate.diff_utils

import androidx.recyclerview.widget.DiffUtil
import org.capstone.yourmate.domain.model.Message

class MessageDiffUtil : DiffUtil.ItemCallback<Message>() {
    override fun areItemsTheSame(oldItem: Message, newItem: Message): Boolean {
        return oldItem.key == newItem.key
    }

    override fun areContentsTheSame(oldItem: Message, newItem: Message): Boolean {
        return oldItem == newItem
    }
}