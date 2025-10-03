package com.xiaopiao.proof_of_honor;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ModShapes {
    public static VoxelShape BracketAwardCertificateBlock(Direction direction){
        VoxelShape shape;
        switch (direction) {
            case NORTH -> shape = Shapes.or(
                    Block.box(5.5, 1.0, 7.0, 10.5, 9.0, 8.0),
                    Block.box(10.5, 1.0, 6.0, 11.5, 9.0, 8.0),
                    Block.box(4.5, 1.0, 6.0, 5.5, 9.0, 8.0),
                    Block.box(4.5, 9.0, 6.0, 11.5, 10.0, 8.0),
                    Block.box(4.5, 0.0, 6.0, 11.5, 1.0, 8.0),
                    Block.box(6.5, 0.0, 12.0, 9.5, 6.0, 13.0)
            );
            case EAST -> shape = Shapes.or(
                    Block.box(8.0, 1.0, 5.5, 9.0, 9.0, 10.5),
                    Block.box(8.0, 1.0, 10.5, 10.0, 9.0, 11.5),
                    Block.box(8.0, 1.0, 4.5, 10.0, 9.0, 5.5),
                    Block.box(8.0, 9.0, 4.5, 10.0, 10.0, 11.5),
                    Block.box(8.0, 0.0, 4.5, 10.0, 1.0, 11.5),
                    Block.box(3.0, 0.0, 6.5, 4.0, 6.0, 9.5)
            );
            case WEST -> shape = Shapes.or(
                    Block.box(7.0, 1.0, 5.5, 8.0, 9.0, 10.5),
                    Block.box(6.0, 1.0, 4.5, 8.0, 9.0, 5.5),
                    Block.box(6.0, 1.0, 10.5, 8.0, 9.0, 11.5),
                    Block.box(6.0, 9.0, 4.5, 8.0, 10.0, 11.5),
                    Block.box(6.0, 0.0, 4.5, 8.0, 1.0, 11.5),
                    Block.box(12.0, 0.0, 6.5, 13.0, 6.0, 9.5)
            );
            default -> shape = Shapes.or(
                    Block.box(5.5, 1.0, 8.0, 10.5, 9.0, 9.0),
                    Block.box(4.5, 1.0, 8.0, 5.5, 9.0, 10.0),
                    Block.box(10.5, 1.0, 8.0, 11.5, 9.0, 10.0),
                    Block.box(4.5, 9.0, 8.0, 11.5, 10.0, 10.0),
                    Block.box(4.5, 0.0, 8.0, 11.5, 1.0, 10.0),
                    Block.box(6.5, 0.0, 3.0, 9.5, 6.0, 4.0)
            );
        }
        return shape;
    }

    public static VoxelShape ProofofhonorBlock(Direction direction){
        VoxelShape shape;
        switch (direction) {
            case NORTH -> shape = Block.box(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
            case EAST -> shape = Block.box(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
            case WEST -> shape = Block.box(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
            default -> shape = Block.box(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
        }
        return shape;
    }

    public static VoxelShape ThirdplaceplatformBlock(Direction direction){
        VoxelShape shape;
        switch (direction) {
            case NORTH -> shape = Block.box(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
            case EAST -> shape = Block.box(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
            case WEST -> shape = Block.box(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
            default -> shape = Block.box(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
        }
        return shape;
    }
    public static VoxelShape ChampionMedalBlock(Direction direction){
        VoxelShape shape;
        switch (direction) {
            case NORTH -> shape = Block.box(5.0, 7.0, 15.0, 11.0, 13.0, 16.0);
            case EAST -> shape = Block.box(0.0, 7.0, 5.0, 1.0, 13.0, 11.0);
            case WEST -> shape = Block.box(15.0, 7.0, 5.0, 16.0, 13.0, 11.0);
            default -> shape = Block.box(5.0, 7.0, 0.0, 11.0, 13.0, 1.0);
        }
        return shape;
    }

    public static VoxelShape ChampionplatformBlock(Direction direction){
        VoxelShape shape;
        switch (direction) {
            case NORTH -> shape = Block.box(4.0, 0.0, 4.0, 12.0, 17.0, 12.0);
            case EAST -> shape = Block.box(4.0, 0.0, 4.0, 12.0, 17.0, 12.0);
            case WEST -> shape = Block.box(4.0, 0.0, 4.0, 12.0, 17.0, 12.0);
            default -> shape = Block.box(4.0, 0.0, 4.0, 12.0, 17.0, 12.0);
        }
        return shape;
    }
    public static VoxelShape LargescalehangingblessingsBlock(Direction direction){
        VoxelShape shape;
        switch (direction) {
            case NORTH -> shape = Shapes.or(
                    Block.box(-9.0, 0.0, 14.5, 25.0, 16.0, 15.5),
                    Block.box(-11.0, -2.0, 14.0, 27.0, 0.0, 16.0),
                    Block.box(-11.0, 16.0, 14.0, 27.0, 18.0, 16.0),
                    Block.box(-11.0, 0.0, 14.0, -9.0, 16.0, 16.0),
                    Block.box(25.0, 0.0, 14.0, 27.0, 16.0, 16.0)
            );
            case EAST -> shape = Shapes.or(
                    Block.box(0.5, 0.0, -9.0, 1.5, 16.0, 25.0),
                    Block.box(0.0, -2.0, -11.0, 2.0, 0.0, 27.0),
                    Block.box(0.0, 16.0, -11.0, 2.0, 18.0, 27.0),
                    Block.box(0.0, 0.0, -11.0, 2.0, 16.0, -9.0),
                    Block.box(0.0, 0.0, 25.0, 2.0, 16.0, 27.0)
            );
            case WEST -> shape = Shapes.or(
                    Block.box(14.5, 0.0, -9.0, 15.5, 16.0, 25.0),
                    Block.box(14.0, -2.0, -11.0, 16.0, 0.0, 27.0),
                    Block.box(14.0, 16.0, -11.0, 16.0, 18.0, 27.0),
                    Block.box(14.0, 0.0, 25.0, 16.0, 16.0, 27.0),
                    Block.box(14.0, 0.0, -11.0, 16.0, 16.0, -9.0)
            );
            default -> shape = Shapes.or(
                    Block.box(-9.0, 0.0, 0.5, 25.0, 16.0, 1.5),
                    Block.box(-11.0, -2.0, 0.0, 27.0, 0.0, 2.0),
                    Block.box(-11.0, 16.0, 0.0, 27.0, 18.0, 2.0),
                    Block.box(25.0, 0.0, 0.0, 27.0, 16.0, 2.0),
                    Block.box(-11.0, 0.0, 0.0, -9.0, 16.0, 2.0)
            );
        }
        return shape;
    }
    public static VoxelShape MediumsizedhangingblessingBlock(Direction direction){
        VoxelShape shape;
        switch (direction) {
            case NORTH -> shape = Shapes.or(
                    Block.box(3.0, 0.0, 14.5, 13.0, 16.0, 15.5),
                    Block.box(1.0, -2.0, 14.0, 15.0, 0.0, 16.0),
                    Block.box(1.0, 16.0, 14.0, 15.0, 18.0, 16.0),
                    Block.box(1.0, 0.0, 14.0, 3.0, 16.0, 16.0),
                    Block.box(13.0, 0.0, 14.0, 15.0, 16.0, 16.0)
            );
            case EAST -> shape = Shapes.or(
                    Block.box(0.5, 0.0, 3.0, 1.5, 16.0, 13.0),
                    Block.box(0.0, -2.0, 1.0, 2.0, 0.0, 15.0),
                    Block.box(0.0, 16.0, 1.0, 2.0, 18.0, 15.0),
                    Block.box(0.0, 0.0, 1.0, 2.0, 16.0, 3.0),
                    Block.box(0.0, 0.0, 13.0, 2.0, 16.0, 15.0)
            );
            case WEST -> shape = Shapes.or(
                    Block.box(14.5, 0.0, 3.0, 15.5, 16.0, 13.0),
                    Block.box(14.0, -2.0, 1.0, 16.0, 0.0, 15.0),
                    Block.box(14.0, 16.0, 1.0, 16.0, 18.0, 15.0),
                    Block.box(14.0, 0.0, 13.0, 16.0, 16.0, 15.0),
                    Block.box(14.0, 0.0, 1.0, 16.0, 16.0, 3.0)
            );
            default -> shape = Shapes.or(
                    Block.box(3.0, 0.0, 0.5, 13.0, 16.0, 1.5),
                    Block.box(1.0, -2.0, 0.0, 15.0, 0.0, 2.0),
                    Block.box(1.0, 16.0, 0.0, 15.0, 18.0, 2.0),
                    Block.box(13.0, 0.0, 0.0, 15.0, 16.0, 2.0),
                    Block.box(1.0, 0.0, 0.0, 3.0, 16.0, 2.0)
            );
        }
        return shape;
    }
    public static VoxelShape RunnerupmedalBlock(Direction direction) {
        VoxelShape shape;
        switch (direction) {
            case NORTH -> shape = Block.box(5.0, 7.0, 15.0, 11.0, 13.0, 16.0);
            case EAST -> shape = Block.box(0.0, 7.0, 5.0, 1.0, 13.0, 11.0);
            case WEST -> shape = Block.box(15.0, 7.0, 5.0, 16.0, 13.0, 11.0);
            default -> shape = Block.box(5.0, 7.0, 0.0, 11.0, 13.0, 1.0);
        }
        return shape;
    }
    public static VoxelShape RunnerupplatformBlock(Direction direction) {
        VoxelShape shape;
        switch (direction) {
            case NORTH -> shape = Block.box(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
            case EAST -> shape = Block.box(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
            case WEST -> shape = Block.box(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
            default -> shape = Block.box(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
        }
        return shape;
    }
    public static VoxelShape RunnerupTrophyBlock(Direction direction) {
        VoxelShape shape;
        switch (direction) {
            case NORTH -> shape = Block.box(4.0, 0.0, 4.0, 12.0, 17.0, 12.0);
            case EAST -> shape = Block.box(4.0, 0.0, 4.0, 12.0, 17.0, 12.0);
            case WEST -> shape = Block.box(4.0, 0.0, 4.0, 12.0, 17.0, 12.0);
            default -> shape = Block.box(4.0, 0.0, 4.0, 12.0, 17.0, 12.0);
        }
        return shape;
    }
    public static VoxelShape SilkbannerBlock(Direction direction) {
        VoxelShape shape;
        switch (direction) {
            case NORTH -> shape = Shapes.or(
                    Block.box(1.0, -9.0, 13.5, 15.0, 11.0, 14.5),
                    Block.box(2.0, -11.0, 13.5, 14.0, -9.0, 14.5),
                    Block.box(0.0, 11.0, 12.0, 16.0, 15.0, 16.0)
            );
            case EAST -> shape = Shapes.or(
                    Block.box(1.5, -9.0, 1.0, 2.5, 11.0, 15.0),
                    Block.box(1.5, -11.0, 2.0, 2.5, -9.0, 14.0),
                    Block.box(0.0, 11.0, 0.0, 4.0, 15.0, 16.0)
            );
            case WEST -> shape = Shapes.or(
                    Block.box(13.5, -9.0, 1.0, 14.5, 11.0, 15.0),
                    Block.box(13.5, -11.0, 2.0, 14.5, -9.0, 14.0),
                    Block.box(12.0, 11.0, 0.0, 16.0, 15.0, 16.0)
            );
            default -> shape = Shapes.or(
                    Block.box(1.0, -9.0, 1.5, 15.0, 11.0, 2.5),
                    Block.box(2.0, -11.0, 1.5, 14.0, -9.0, 2.5),
                    Block.box(0.0, 11.0, 0.0, 16.0, 15.0, 4.0)
            );
        }
        return shape;
    }
    public static VoxelShape SmallscalehangingblessingBlock(Direction direction) {
        VoxelShape shape;
        switch (direction) {
            case NORTH -> shape = Shapes.or(
                    Block.box(3.0, 5.0, 13.5, 13.0, 12.0, 14.5),
                    Block.box(1.0, 3.0, 13.0, 15.0, 5.0, 15.0),
                    Block.box(1.0, 12.0, 13.0, 15.0, 14.0, 15.0),
                    Block.box(1.0, 5.0, 13.0, 3.0, 12.0, 15.0),
                    Block.box(13.0, 5.0, 13.0, 15.0, 12.0, 15.0)
            );
            case EAST -> shape = Shapes.or(
                    Block.box(1.5, 5.0, 3.0, 2.5, 12.0, 13.0),
                    Block.box(1.0, 3.0, 1.0, 3.0, 5.0, 15.0),
                    Block.box(1.0, 12.0, 1.0, 3.0, 14.0, 15.0),
                    Block.box(1.0, 5.0, 1.0, 3.0, 12.0, 3.0),
                    Block.box(1.0, 5.0, 13.0, 3.0, 12.0, 15.0)
            );
            case WEST -> shape = Shapes.or(
                    Block.box(13.5, 5.0, 3.0, 14.5, 12.0, 13.0),
                    Block.box(13.0, 3.0, 1.0, 15.0, 5.0, 15.0),
                    Block.box(13.0, 12.0, 1.0, 15.0, 14.0, 15.0),
                    Block.box(13.0, 5.0, 13.0, 15.0, 12.0, 15.0),
                    Block.box(13.0, 5.0, 1.0, 15.0, 12.0, 3.0)
            );
            default -> shape = Shapes.or(
                    Block.box(3.0, 5.0, 1.5, 13.0, 12.0, 2.5),
                    Block.box(1.0, 3.0, 1.0, 15.0, 5.0, 3.0),
                    Block.box(1.0, 12.0, 1.0, 15.0, 14.0, 3.0),
                    Block.box(13.0, 5.0, 1.0, 15.0, 12.0, 3.0),
                    Block.box(1.0, 5.0, 1.0, 3.0, 12.0, 3.0)
            );
        }
        return shape;
    }
    public static VoxelShape ThirdplacemedalBlock(Direction direction) {
        VoxelShape shape;
        switch (direction) {
            case NORTH -> shape = Block.box(5.0, 7.0, 15.0, 11.0, 13.0, 16.0);
            case EAST -> shape = Block.box(0.0, 7.0, 5.0, 1.0, 13.0, 11.0);
            case WEST -> shape = Block.box(15.0, 7.0, 5.0, 16.0, 13.0, 11.0);
            default -> shape = Block.box(5.0, 7.0, 0.0, 11.0, 13.0, 1.0);
        }
        return shape;
    }
    public static VoxelShape ThirdplacetrophyBlock(Direction direction) {
        VoxelShape shape;
        switch (direction) {
            case NORTH -> shape = Block.box(4.0, 0.0, 4.0, 12.0, 17.0, 12.0);
            case EAST -> shape = Block.box(4.0, 0.0, 4.0, 12.0, 17.0, 12.0);
            case WEST -> shape = Block.box(4.0, 0.0, 4.0, 12.0, 17.0, 12.0);
            default -> shape = Block.box(4.0, 0.0, 4.0, 12.0, 17.0, 12.0);
        }
        return shape;
    }

}
