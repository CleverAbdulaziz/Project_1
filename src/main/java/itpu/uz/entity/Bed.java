package itpu.uz.entity;



public final class Bed extends Furniture<Bed> {
    private int numberOfDrawers;

    public Bed(int numberOfDrawers) {
        this.numberOfDrawers = numberOfDrawers;
    }

    public int getNumberOfDrawers() {
        return numberOfDrawers;
    }

    public void setNumberOfDrawers(int numberOfDrawers) {
        this.numberOfDrawers = numberOfDrawers;
    }


    @Override
    public String toString() {
        return super.toString().replaceAll("}", "") +
                String.join(", ", ", number of drawers = " + numberOfDrawers) + " }";
    }

}