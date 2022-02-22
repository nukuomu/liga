package lesson_3.homework;

import lesson_3.homework.searchField.SearchLine;

public class Main {
    public static void main(String[] args)
    {
        LineCategories appliances = new LineCategories();
        appliances.openCategory();

        LineCategories smartphonesWatches = new LineCategories();
        smartphonesWatches.openCategory();

        LineCategories televisions = new LineCategories();
        televisions.openCategory();

        LineCategories notebooksTablets = new LineCategories();
        notebooksTablets.openCategory();

        LineCategories computers = new LineCategories();
        computers.openCategory();

        LineCategories earphonesAudio = new LineCategories();
        earphonesAudio.openCategory();

        LineCategories gamesConsoles = new LineCategories();
        gamesConsoles.openCategory();


        BlockCategories phonesBlock = new BlockCategories();
        phonesBlock.hoverMouse();

        BlockCategories tabletsBlock = new BlockCategories();
        tabletsBlock.hoverMouse();

        BlockCategories notebooksBlock = new BlockCategories();
        notebooksBlock.hoverMouse();

        BlockCategories televisionsBlock = new BlockCategories();
        televisionsBlock.hoverMouse();

        BlockCategories computerBlock = new BlockCategories();
        computerBlock.hoverMouse();

        BlockCategories watchesBlock = new BlockCategories();
        watchesBlock.hoverMouse();

        BlockCategories accessoriesBlock = new BlockCategories();
        accessoriesBlock.hoverMouse();

        BlockCategories earphonesBlock = new BlockCategories();
        earphonesBlock.hoverMouse();

        BlockCategories camerasBlock = new BlockCategories();
        camerasBlock.hoverMouse();

        BlockCategories gamesBlock = new BlockCategories();
        gamesBlock.hoverMouse();

        BlockCategories smartHomeBlock = new BlockCategories();
        smartHomeBlock.hoverMouse();

        BlockCategories officeTechBlock = new BlockCategories();
        officeTechBlock.hoverMouse();

    }
}