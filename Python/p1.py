t=(30,10,30,20,30,40,30)
print("Tuple:",t)
t1=t[0:2]
t2=(50,60)
print("Sliced",t1)
print(len(t))
print(len(t1))
print(t.index(20))
print(t.count(30))
print(10 in t)
print(t1+t2)
print(t1*5)
print(min(t))
print(max(t))
print(sorted(t))

t4=(60,70,80,90)
first,second,third,forth=t4
print(first)
l=[1,2,3,4,5]
print(l)
print(tuple(l))

class student:
    def __init__(self,name,age):
        self.name=name
        self.age=age

    def display(self):
        print("name:",self.name)
        print("age:",self.age)

class product:
    def __init__(self,pname,price):
        self.pname=pname
        self.price=price

    def pdisplay(self):
        print("Product name:",self.pname)
        print("Price:",self.price)

s1=student("Priya",20)
s1.display()
p1=product("Ketchup",50)
p1.pdisplay()

class ATM:
    def __init__(self,__balance):
        self.__balance=__balance
    def deposite(self,amount):
        self.__balance+=amount
    def display(self):
        print("Current Balance:",self.__balance)

a=ATM(50000)
a.deposite(500)
a.display()

#inheritance
class Parent:
    def parent(self):
        print("From parent class")

class Child(Parent):
    def child(self):    
        print("From child class")

c=Child()
c.child()
c.parent()

class animal:
    def __init__(self,eat,sound):
        self.eat=eat
        self.sound=sound
    def cat(self,eat):
        print("Eat")
    def cat(self):
        print("sound")
a1=animal("food","meow")
a1.cat()