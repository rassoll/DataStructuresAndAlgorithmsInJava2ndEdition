package chapter5;

/**
 * Программный проект 5.5 - Program project 5.5
 *
 * @author rassoll
 * @created 29.10.2017
 * @$Author$
 * @$Revision$
 */
public class JosephusFlaviusProblem
{
    public static void main(String[] args)
    {
        System.out.println(solveProblem(7, 4, 1));
    }

    public static String solveProblem(int peopleCount, int count, int peopleNumber)
    {
        CyclicList cyclicList = new CyclicList();

        cyclicList.insertFirst(1 , 1);
        for (int i = peopleCount; i > 1; i--)
        {
            cyclicList.insertFirst(i , i);
        }

        while (cyclicList.current.iData != peopleNumber)
        {
            cyclicList.step();
        }

        StringBuilder stringBuilder = new StringBuilder();

        while(!cyclicList.isEmpty())
        {
            for (int i = 1; i < count; i++)
            {
                cyclicList.step();
            }

            stringBuilder.append(cyclicList.current.iData + " ");
            cyclicList.delete(cyclicList.current.iData);
        }

        return stringBuilder.toString();
    }
}
