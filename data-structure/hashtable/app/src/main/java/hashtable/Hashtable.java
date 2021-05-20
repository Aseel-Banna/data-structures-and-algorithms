package hashtable;

class HashTable<Key, Value> {

    private static final int INIT_CAPACITY = 10;

    int keyValueNum;
    int size;
    Key[] keys;
    Value[] values;

    public HashTable() {
        this(INIT_CAPACITY);
    }

    public HashTable(int capacity) {
        if(capacity < 1){
            this.size = INIT_CAPACITY;
        } else{
            size = capacity;
        }

        keyValueNum = 0;
        keys = (Key[])   new Object[size];
        values = (Value[]) new Object[size];
    }

    public void add(Key key, Value val){
        if((key == null) || (val == null)){
            throw new IllegalArgumentException("Invalid null key-value!");
        }

        checkLoadFactor();
        int i;
        for (i = hash(key); keys[i] != null; i = (i + 1) % size) {
            if (keys[i].equals(key)) {
                values[i] = val;
                return;
            }
        }
        keys[i] = key;
        values[i] = val;
        keyValueNum++;
    }

    public int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % size;
    }

    public Value get(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("Cannot get null key.");
        }
        for (int i = hash(key); keys[i] != null; i = (i + 1) % size) {
            if (keys[i].equals(key)) {
                return values[i];
            }
        }
        return null;
    }

    public boolean contains(Key key) {
        if (key == null){
            throw new IllegalArgumentException("Cannot find a null key.");
        }
        return get(key) != null;
    }

    private void checkLoadFactor(){
        if(keyValueNum >= size/2){
            resize(2 * size);
        }
    }

    private void resize(int capacity) {
        HashTable<Key, Value> temp = new HashTable<Key, Value>(capacity);
        for (int i = 0; i < size; i++) {
            if (keys[i] != null) {
                temp.add(keys[i], values[i]);
            }
        }
        keys = temp.keys;
        values = temp.values;
        size = temp.size;
    }


}