import random
a_file = open("boyNames.txt", "r")
boyNames = [(line.strip()).split() for line in a_file]
a_file.close()

while True:
    name = random.choice(boyNames)
    x = input('Press enter for a random name. Enter d when done.')
    if x == 'd':
        break
    print (random.choice(name))