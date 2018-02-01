public class arrayList_guanxin
{

    private int size;
    private T[] arr;

    /**
     * Default Constructor
     * Set the initial size to 10
     */
    public arrayList_guanxin()
    {
        this.size = 10;
        this.arr = (T[]) new Object[size];
    }

    /**
     * Create an arraylist with initialize arraylist with given size
     * @param size
     */
    public arrayList_guanxin(int size)
    {
        this.size = size;
        this.arr = (T[]) new Object[size];
    }


    /**
     * @return the size of the array
     */
    public int size()
    {
        return this.size;
    }


    /**
     * check if the arrylist is empty
     * @return True if empty, false otherwise
     */
    public boolean is_empty()
    {
        if(this.size==0)
            return true;
        else
            return false;
    }

    /**
     * Return the object of that the index is asking for
     */
    public T at(int idx) {

        sizeCheck(idx);
        try {
            // write a toPrint method?
            return (T) arr[idx];
        } catch (IndexOutOfBoundsException e) {

            System.out.println("Index out of bounds exception");

        }
    }

    /**
     * Helper method to check whether the index is in the bond
     */
    void sizeCheck(int idx)
    {
        if(idx < 0 || idx >= arr.length)
            throw new IndexOutOfBoundsException();
    }

    /**
     * Push the item into the arraylist
     */
    public void push(T item)
    {
        if(size == this.size())
        {

        }
    }





}
