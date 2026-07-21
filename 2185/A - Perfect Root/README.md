<h2><a href="https://codeforces.com/contest/2185/problem/A" target="_blank" rel="noopener noreferrer">2185A — Perfect Root</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 2185A](https://codeforces.com/contest/2185/problem/A) |

## Topics
`constructive algorithms` `math`

---

## Problem Statement

<div class="header"><div class="title">A. Perfect Root</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>A positive integer $$$x$$$ is a perfect root if there exists an integer $$$y$$$ such that $$$\sqrt{y} = x$$$. For example, $$$5$$$ is a perfect root because $$$\sqrt{25} = 5$$$.</p><p>For each test case, output $$$n$$$ distinct perfect roots. Note that the values only need to be distinct within each test case; you can use the same value in different test cases.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line of the input contains a single integer $$$t$$$ ($$$1 \leq t \leq 20$$$) — the number of test cases.</p><p>The only line of each test case contains an integer $$$n$$$ ($$$1 \leq n \leq 20$$$) — the number of perfect roots to output.</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, output $$$n$$$ distinct perfect roots. Each perfect root $$$x$$$ must be in the range $$$1 \leq x \leq 10^9$$$.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id0013669743118586042" id="id007816951867529549" class="input-output-copier">Copy</div></div><pre id="id0013669743118586042">3
1
2
5
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id009782145390638506" id="id006956315044652093" class="input-output-copier">Copy</div></div><pre id="id009782145390638506">1
2 4
2 102 43 1 21</pre></div></div></div><div class="note"><div class="section-title">Note</div><p>For the first test case: </p><ul> <li> $$$1$$$ is a perfect root because $$$\sqrt{1} = 1$$$. </li></ul><p>For the second test case: </p><ul> <li> $$$2$$$ is a perfect root because $$$\sqrt{4} = 2$$$. </li><li> $$$4$$$ is a perfect root because $$$\sqrt{16} = 4$$$. </li></ul></div>