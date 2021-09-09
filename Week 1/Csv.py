import re

attend = {}
with open('data.csv') as txt:
    for line in txt:
        h, min, sec, time = 0, 0, 0, 0
        Student = re.findall(r'(.+);.+;.+, \d+:\d+:\d{2}', line)
        action = re.findall(r'.+;(.+);.+, \d+:\d+:\d{2}', line)
        timestamp = re.findall(r'.+;.+;.+, (\d+:\d+:\d{2})', line)
        
        if len(timestamp) != 0:
            h = int(re.findall(r'(\d+):\d+:\d{2}', timestamp[0])[0])
            min = int(re.findall(r'\d+:(\d+):\d{2}', timestamp[0])[0])
            sec = int(re.findall(r'\d+:\d+:(\d{2})', timestamp[0])[0])
            time = h * 3600 + min * 60 + sec
        
            if Student[0] not in attend.keys():
                attend[Student[0]] = time
            elif action[0] == 'Joined':
                attend[Student[0]] += time
            elif action[0] == 'Left':
                attend[Student[0]] -= time
    ans = sorted(sorted(attend.items()), key = lambda x:(abs(x[1]), x[0]))

    for student, time in ans:
        h = str(abs(time) // 3600)
        min = str(abs(time) // 60 % 60)
        sec = str(abs(time) % 60)
        if len(h) == 1: h = '0' + h
        if len(min) == 1: min = '0' + min
        if len(sec) == 1: sec = '0' + sec

        print(f'{student}: {h}:{min}:{sec}')

search = input('Enter student name: ')
for student, time in ans:
    if search in student:
        print(f'{student}: {h}:{min}:{sec}')
        exit()
print("Name doesn't exist")