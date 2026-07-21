class MinStack {
    int[] arr,arr2;
    int top = -1;
    public MinStack() {
        this.arr = new int[100000];       
        this.arr2 = new int[100000];       
    }
    
    public void push(int value) {
        top++;
        arr[top] = value;
        if(top == 0) arr2[top] = value;
        else arr2[top] = value < arr2[top-1]? value:arr2[top-1];
    }
    
    public void pop() {
        top--;
    }
    
    public int top() {
        return arr[top];
    }
    
    public int getMin() {
        return arr2[top];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */