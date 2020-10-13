a=[15,5,24,8,1,3,16,10,20]
def merge(a,lb,mid,ub) :
    i=lb
    j=mid+1
    k=0
    b=a[lb:ub+1]
    while((i<=mid)and (j<=ub)) :
        if a[i]<a[j] :
            b[k]=a[i]
            i=i+1
            k=k+1
        else :
            b[k]=a[j]
            j=j+1
            k=k+1
    if(i<=mid) :
        while (i<=mid) :
            b[k]=a[i]
            i=i+1
            k=k+1
    else :
        while(j<=ub) :
            b[k]=a[i]
            j=j+1
            k=k+1
    l=lb
    i=0
    while (l<=ub) :
        a[l]=b[i]
        l=l+1
        i=i+1
def mergeSort(a,lb,ub) :
    if lb<ub :
        mid=(ub+lb)//2
        mergeSort(a,lb,mid)
        mergeSort(a,mid+1,ub)
        merge(a,lb,mid,ub)
def printArray(a) :
    for i in a :
        print(i)
mergeSort(a,0,(len(a)-1))
printArray(a)