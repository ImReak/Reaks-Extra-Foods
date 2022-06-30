package com.net.reaksextrafoods;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import java.util.List;

public class TinnedSalmonCaviar extends Item {
    public TinnedSalmonCaviar(Settings settings){
        super(settings);
    }
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("tinned_salmon_caviar_synopsis_p1").formatted(Formatting.RED));
        tooltip.add(Text.translatable("tinned_salmon_caviar_synopsis_p2").formatted(Formatting.GREEN));
    }
}
