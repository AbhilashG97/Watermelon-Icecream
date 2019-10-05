import os
path = os.path.join(os.path.dirname(__file__),"..") + "Watermelon-Icecream"
walk = os.walk(path)
for root, dirs, files in os.walk(".", topdown=False):
   for name in dirs:
        folder = os.path.join(root, name)
        if folder.find('.git') == -1 and folder.find('.idea') == -1:
            file = folder+'\README.md'
            if not(os.path.exists(file)):
                print(file[22:])
                f = open(file, "w+")
                f.close()
