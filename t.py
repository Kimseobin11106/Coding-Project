import turtle
from turtle import *
# t = turtle.Turtle()

# Turtle t1 = new Turtle();

t1 = turtle.Turtle()
t1.speed(0)
colormode(255)
dist = 1
step = 1
angle = 90
red = 255
green = 0
blue = 0
while True:
    t1.color(red, green, blue)
    t1.right(angle)
    t1.forward(dist)
    dist += step
    red = (red + 30)
    #green이 증가하는 경우
    if red >= 255:
        red = 0
        green = green + 30

    #blue가 증가하는 경우
    if green >= 255:
        green = 0
        blue = blue + 30

    if blue >= 255:
        blue = 0


turtle.exitonclick()