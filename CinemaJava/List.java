package CinemaJava;
import java.lang.reflect.Array;

public class List<E> 
{  
    private E[] elements;
    Class<E[]> clazz;

    public List(Class<E[]> clazz, int length) 
    {
        this.clazz = clazz;
        elements = clazz.cast(Array.newInstance(clazz.getComponentType(), length));
    }  

    public void setList(E[] elements) {this.elements = elements;}
    public E[] getList() {return elements;}

    public void set(E element, int index) {if (index<elements.length && index >= 0) elements[index] = element;}
    public E get(int index){if (index>=elements.length || index < 0) return null; return elements[index];}

    private E[] newArray(int size){return clazz.cast(Array.newInstance(clazz.getComponentType(), size));}

    public void add(E element)
    {
        E[] auxElements = newArray(elements.length+1);
        for (int i = 0; i < elements.length; i++)
            auxElements[i] = elements[i];
        auxElements[auxElements.length-1] = element;
        elements = auxElements;
    }

    public void remove(E element)
    {
        E[] auxElements = newArray(elements.length-1);
        for (int i = 0, adder = 0; i < auxElements.length; i++)
        {
            if (element.equals(elements[i+adder])) adder++;
            auxElements[i] = elements[i+adder];
        }
        elements = auxElements;
    }

    @Override
    public String toString() 
    {
        return  ArraysUtils.toString(elements);
    }
}